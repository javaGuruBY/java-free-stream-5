package AndryBorisevich;

public class Key {
   private String typeKey;

    public void setTypeKey(String typeKey) {
        this.typeKey = typeKey;
    }

    public  void openThingWithInputTypeOfKey(){
        System.out.println("Open " + this.typeKey);
    }
}
