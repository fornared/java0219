package ch13.lecture.p01generic;

public class C01GenericType {
    public static void main(String[] args) {
        C01Box box = new C01Box();
        box.setItem("java");
//        String item = box.getItem();
        Object item = box.getItem();
        if (item instanceof String) {
            String str = (String) item;
            System.out.println("스트링에 관련된 일...");
        }

        C01Box box2 = new C01Box();
        box2.setItem(300);
//        Integer item2 = (Integer) box2.getItem();
        Object item2 = box2.getItem();
        if (item2 instanceof Integer) {
            Integer i = (Integer) item;
            System.out.println("인티저 관련된 일...");
        }

    }
}

class C01Box {
    /*
    private String item;

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
     */

    private Object item;

    public Object getItem() {
        return item;
    }

    public void setItem(Object item) {
        this.item = item;
    }
}