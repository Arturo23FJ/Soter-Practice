package game;
/*Exercise:
Rock-Paper-Scissors game: we play until someone gets 2 wins. The computer's choice should be random.
0 = rock, 1 = paper, 2 = scissors
There should be a player class, we should create two objects of it in the Main class
We should have a setter to set our choice
There should be  method which sets random choice
In the Main class, one of the objects should be the computer, one of them should be us
We should input our choice, the computer should call the random choice method
Let's check who won each round and summarize it in the end
 */
public class Main {
    public static void main(String[] args) {
        Player computer = new Player();
        Player player = new Player();

        whoWins(computer, player);
    }

    public static void whoWins(Player computer, Player player) {
        String computerChoice = computer.randomChoice();
        String playerChoice = player.setChoiceByInput();

        if (computerChoice.equals(playerChoice)) {
            System.out.println("Draw! Player chose: " + playerChoice + ", Computer chose: " + computerChoice);
        } else if ((computerChoice.equals("Rock") && playerChoice.equals("Scissors")) ||
                (computerChoice.equals("Paper") && playerChoice.equals("Rock")) ||
                (computerChoice.equals("Scissors") && playerChoice.equals("Paper"))) {
            System.out.println("Computer wins! Computer chose " + computerChoice +
                    ", Player chose: " + playerChoice);
        } else {
            System.out.println("Player wins! Player chose: " + playerChoice + ", Computer chose: " + computerChoice);
        }
    }
}