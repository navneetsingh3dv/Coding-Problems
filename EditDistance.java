class Solution {
    public int minDistance(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        int[][] count = new int[len1+1][len2+1];
        for(int i = 0;i<=len1;i++)
        {
            for(int j = 0;j<=len2;j++)
            {
                if(i==0)
                    count[i][j] = j;
                else if(j==0)
                    count[i][j] = i;
                else if(word1.charAt(i-1)==(word2.charAt(j-1)))
                {
                    count[i][j] = count[i-1][j-1];
                }
                else
                {
            count[i][j] = Math.min(count[i-1][j-1],Math.min(count[i-1][j],count[i][j-1]))+1;
                }
            }
        }
        return count[len1][len2];
    }
}
