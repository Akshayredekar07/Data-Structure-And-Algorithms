package shraddha;

public class InterfaceImpt {
    public static void main(String[] args) {
      Queen q = new Queen();
      q.moves();  
    }
}



 interface ChessPlayer {
    void moves();
}


class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, right, digonal (in all 4 dirns) ");
    }
}


class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right");
    }
}


class King implements ChessPlayer{
    public void moves(){
        System.out.println("up, down, left, right");
    }
}


interface Herivore{

}

interface Carnivore{

}

class Bear implements Herivore, Carnivore{
    
}