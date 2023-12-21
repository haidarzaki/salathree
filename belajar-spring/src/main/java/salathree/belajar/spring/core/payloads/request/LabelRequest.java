package salathree.belajar.spring.core.payloads.request;

public class LabelRequest{
    private String Label_name;
    private int visible;

    public LabelRequest(){
        this.Label_name = Label_name;
        this.visible = visible;
    }

    public String getLabel_name(){
        return Label_name;
    }

    public void setLabel_name(){
        this.Label_name = Label_name;
    }

    public int getVisible(){
        return visible;
    }

    public void setVisible(){
        this.visible = visible;
    }

}