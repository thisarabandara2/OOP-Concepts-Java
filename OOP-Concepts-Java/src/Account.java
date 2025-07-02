class Account
{
    int a,b;
    public void setData(int a, int b)
    {
        a=a;
        b=b;
    }
    public void showData(){
        System.out.println(“Value of A=” +a);
        System.out.println(“Value of B=” +b);
    }
    {
        public static void main(String[] args)
        Account myAccount= new Account();
        myAccount.setData(2,3);
        myAccount.showData();
    }
}