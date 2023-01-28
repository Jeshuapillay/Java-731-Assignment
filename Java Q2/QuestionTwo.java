class QustionTwo{
    public static void main(String[] args){
        int num = 1;
        
        for(int i = 1; i <= 40; i++){
            System.out.printf("%-8d", findPentNumber(i));
            if(num % 10 == 0){
                System.out.println();
            }
            num++;
        }
    }

    public static int findPentNumber(int i){
        return (i * (3 * i - 1)) / 2;
    }
}