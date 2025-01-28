class Main{
    public static void main(String[] args) {
        int num = 543;
        int sum = 0;
        while(num != 0){
            int remainder = num % 10;
            sum = sum + remainder;
            num = num / 10;
        }
        System.out.println(sum);
    }
}

