# GeeksForGeeks-Amazon-Baseball-Game
Please find the question statement in question folder

John plays a game in which he throws a ball at various blocks marked with symbol so as to knock these out. A score is computed for
each throw. The last score is the score of the previous throw (or 0, if there is no previous throw) and the total score is the sum 
of the scores of all throws. The symbol on a block can be an integer, a sign or a letter. Each sign or letter represtens a special
rule as given below.

If a throw hits a block marked with an integer, the score for that throw is the value of that integer.
If a throw hits a block marked with an X, the score for that throw is double the last score.
If a throw hits a block marked with a '+', the score for that throw is the sum of the last two scores.
If a throw hits a block marked with a 'Z', the last score is removed as though the last throw never happened. Its value does not 
count towards the total score and the subsequesnt throws will ignore it when computing their values.

Write an algo that computes the total score for a given list of ordered hits by john.

Input:
The input to the function consists of two arguments - blocks, representing a list of symbols and n, an integer representing the
number of symbols in the list.

Output:
Return an integer representing the total score for the given list of ordered hits.

Example:
Input:
blocks = [5,-2,4,Z,X,9,+,+], n = 8

Output:
27
