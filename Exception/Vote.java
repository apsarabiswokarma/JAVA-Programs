class InvalidvoteException extends InvalidvoteException{
    public InvalidvoteException(String Msg){
        super(msg);

    }
}
class Vote
{
    String name;
    int age;

    public Vote(String name,int age) throws InvalidvoteException
    {
        if(age<18)
        {
            throw new InvalidvoteException("invalid!!");
        }
        else{
            this.name=name;
            this.age=age;

        }
    }
    public static void main(String []args)
    {
        try{
            Vote v= new Vote("sujata",15);

        }
        catch(InvalidvoteException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
