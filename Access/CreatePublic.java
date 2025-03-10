// File: /C:/Users/Aniket Singh/OneDrive/New Folder/JavaAssignment/src/Access/CreatePublic.java
package Access;

public class CreatePublic {
    public String publicField;

    public CreatePublic(String publicField) {
        this.publicField = publicField;
    }

    public void publicMethod() {
        System.out.println("Public method called. Public field value: " + publicField);
    }
}