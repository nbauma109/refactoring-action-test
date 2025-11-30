package demo;

import java.util.List;
import java.util.ArrayList;
import java.util.Map; // unused
import java.io.File; // unused

public class MessyImports {

    public List<String> test() {
        ArrayList<String> list = new ArrayList<>();
        return list;
    }
}
