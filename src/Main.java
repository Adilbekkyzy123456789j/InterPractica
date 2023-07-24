public class Main {
    public static void main(String[] args) {

        BakeAble[] bakeAbles = new BakeAble[]{new Cake(), new Nan(), new Bulochka()};
        for (BakeAble bakeAble : bakeAbles) {
                bakeAble.bake();
            }
        }
    }
