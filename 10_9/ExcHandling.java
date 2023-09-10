//Exception handling
class CatechException extends Exception{
    public CatechException(String message){
        super(message);
    }

}
class te
{
    public void throwException() throws CatechException{
        throw new CatechException("Hello i am throws message");
    }
}
public class ExcHandling {
    public static void main(String[] args) {
        te t = new te();
        try{
            t.throwException();
        } catch (CatechException c){
            System.out.println("The Exceotion is: "+c.getMessage());
        }
    }
}