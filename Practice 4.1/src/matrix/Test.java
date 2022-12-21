package matrix;

public class Test
{
    public static void main(String[] args)
    {
        float[][] arr = new float [][]
                {
                        {3,3,3,3,3},{3,3,3,3,3},{3,3,3,3,3},{3,3,3,3,3},{3,3,3,3,3}
                };

        System.out.println("Изначальная матрица: ");
        Matrix.printMatrix();
        Matrix.summa(arr);
        System.out.println("Матрица после суммы: ");
        Matrix.printMatrix();
        Matrix.multiplication(2);
        System.out.println("Матрица после умножения на число: ");
        Matrix.printMatrix();
        System.out.println("Матрица после умножения на матрицу: ");
        Matrix.multMatrix(arr);
        Matrix.printMatrix();
    }
}
