/*
 */
package amazonques1;

/**
 *
 * @author Ali
 */
import java.util.*;

public class AmazonQues1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //String[] str = {"5","-2","4","Z","X","9","+","+"};
        String[] str = {"1","2","+","Z"};
        System.out.println(totalScore(str, 4));
    }
    
    public static int totalScore(String[] blocks, int n)
    {
        if(n == 0)
            return 0;

        ArrayList<Integer> list = new ArrayList<>();
        int total = 0;
        
        for(int i=0; i<n; i++)
        {
            if(blocks[i].equals("Z") || (i+1 < n && blocks[i+1].equals("Z")))
                continue;
            
            if(blocks[i].equals("X"))
                list = applyRuleX(list);
            else if(blocks[i].equals("+"))
                list = applyRuleSum(list);
            else
            {
                list.add(Integer.parseInt(blocks[i]));
            }
            
            total += list.get(list.size()-1);
        }

        return total;
    }

    private static ArrayList<Integer> applyRuleX(ArrayList<Integer> list)
    {
        if(list.size() < 1)
            return list;
        
        int index = list.size() - 1;
        int numX = list.get(index) * 2;
        list.set(index, numX);
        
        return list;
    }

    private static ArrayList<Integer> applyRuleSum(ArrayList<Integer> list)
    {
        if(list.size() < 2)
            return list;
        
        int index1 = list.size() - 1;
        int index2 = list.size() - 2;
        
        int sum = list.get(index1) + list.get(index2);
        list.add(sum);
        
        return list;
    }
}
