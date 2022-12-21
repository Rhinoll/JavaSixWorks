package matrix;

public class Matrix
{
    private static int n=5;
    private static int m=5;
    private static  float[][] arr = new float[][]
            {
                    {1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1}
            };

    public static void summa(float[][] sum)
    {
        for (int i=0; i<n; i++)
        {
            for (int j=0; j<m; j++)
            {
                arr[i][j]+=sum[i][i];
            }
        }
    }

    public static void multiplication(int value)
    {
        for (int i=0; i<n; i++)
        {
            for (int j=0; j<m; j++)
            {
                arr[i][j]*=value;
            }
        }
    }

    public static void printMatrix()
    {
        for (int i=0; i<n; i++)
        {
            for (int j=0; j<m; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }

    public static void multMatrix(float[][] mult)
    {
        for (int i=0; i<n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                arr[i][j]*=mult[j][i];
            }
        }
    }
}
