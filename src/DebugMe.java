public class DebugMe {
        public static void main(String[] args)
        {
            int[][] matrix1 = {{1,3,34}, {2, 54, 12}, {45, 92, 3}};
            int[][] matrix2 = {{1,45}, {4,5,78,103,23}, {1, 34, 1}};
            int[][] matrix3 = {{1, 68, 2, 1}, {1, 8, 1, 1}, {1, 3, 5}};

            int[][] orderedPairs = findValue(matrix3, 1);

            display(orderedPairs);
        }

        // todo: Fix the FindValue(int[][] matrix, int value) method
        // this method should identify all instances of a value in an int array and
        // return an ordered pair as part of a 2D array for each instance
        public static int[][] findValue(int[][] matrix, int value)
        {
            int[][] orderedPairs = new int[5][2];
            int numFound = 0;

            for (int i = 0; i < matrix.length; i++)
            {
                for (int k = 0; k < matrix[i].length; k++);
                {
                    if (matrix[i][k] == value)
                    {
                        orderedPairs[numFound][0] = i;
                        orderedPairs[numFound][1] = k;
                        numFound++;
                    }
                }
            }

            if (numFound == 0)
            {
                int[][] nothing = {{999,999}};
                return nothing;
            }
            return orderedPairs;
        }

        public static void display(int[][] matrix)
        {
            System.out.println("Value found at indices:");
            for (int i = 0; i < matrix.length; i++)
            {
                if (matrix[0][0] == 999)
                {
                    System.out.println("Value not found");
                    i = matrix.length;
                }
                else if(matrix[i][0] == 0 && matrix[i][1] == 0)
                {
                    if (i == 0)
                    {
                        System.out.println("(" + matrix[i][0] + ", " + matrix[i][1] + ")");
                    }
                    else
                    {
                        i = matrix.length;
                    }
                }
                else System.out.println("(" + matrix[i][0] + ", " + matrix[i][1] + ")");
            }
        }
    }


