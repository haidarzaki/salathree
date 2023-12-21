package salathree.belajar.spring.core.payloads.request;

public class RoleRequest{
    private String role_name;

    public class RoleRequest(){}
    RoleRequest(String role_name){
        this.role_name = role_name;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

}