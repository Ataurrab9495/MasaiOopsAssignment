package AbsFile;

interface Playable {
    public void play();
}

class Guitar implements Playable {
    @Override
    public void play() {
        System.out.println("Guitar is playing!");
    }
};

class Piano implements Playable {
    @Override
    public void play() {
        System.out.println("Piano is playing!");
    }
}

public class inter {
    public static void main(String[] args){
        Guitar gu = new Guitar();
        gu.play();

        Piano pi = new Piano();
        pi.play();
    }
}
