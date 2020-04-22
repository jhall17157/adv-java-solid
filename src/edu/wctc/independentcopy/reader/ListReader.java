package edu.wctc.independentcopy.reader;

import java.util.ArrayList;
import java.util.List;

public class ListReader implements Reader {
    @Override
    public String readln() {
      List<String> list = new ArrayList<>();
      list.add("Name1");
      list.add("Name2");
      list.add("Name3");
        return list.get(0) + " " + list.get(1) + " " + list.get(3);
    }
}
