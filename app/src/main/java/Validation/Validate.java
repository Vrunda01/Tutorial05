package Validation;

public class Validate {

    public boolean isnull(String fname)
    {
        if(fname.isEmpty()) {
            return true;
        }
        return false;
    }
}
