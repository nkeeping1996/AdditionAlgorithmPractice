public class Main {
    public static void main(String[] args) {
        int sum = Add(12, 34);
        //System.out.println(sum);
    }

    public static int Add(int x, int y){
        int n = Integer.toString(x).length();

        String[] xArrString = Integer.toString(x).split("");
        String[] yArrString = Integer.toString(y).split("");

        int[] xArrInt = new int[n];
        for(int i = n-1; i >= 0; i--){
            xArrInt[i] = Integer.parseInt(xArrString[n-1-i]);
        }

        int[] yArrInt = new int[n];
        for(int i = n-1; i >= 0; i--){
            yArrInt[i] = Integer.parseInt(yArrString[n-1-i]);
        }

        int[] cArrInt = new int[n];
        cArrInt[0] = 0;

        int[] solution = new int[n+1];

        for(int i = 0; i < n-1; i++){
            int s = cArrInt[i] + xArrInt[i] + yArrInt[i];
            solution[n-i] = s % 10;
            cArrInt[i+1] = ((s-solution[n-i])/10);
        }
        solution[0] = cArrInt[0];

        for(int i : solution){
            System.out.print(i);
        }
        return 0;
    }
}