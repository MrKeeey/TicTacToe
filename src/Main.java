public class Main {
    public static void main(String[] args) {
        System.out.println("Soon...");

    }
}

//test code
/*
public class TicTacToeGame extends Game {
    private int[][] model = new int[3][3];
    private int currentPlayer;
    private boolean isGameStopped;

    public void initialize() {
        setScreenSize(3, 3);
        startGame();
        updateView();
    }

    public void startGame() {
        currentPlayer = 1;
        isGameStopped = false;
    }

    public void updateCellView(int x, int y, int value) {
        if (value == 1) {
            setCellValueEx(x, y, Color.WHITE, "X", Color.RED);
        }

        if (value == 2) {
            setCellValueEx(x, y, Color.WHITE, "O", Color.BLUE);
        }

        if (value == 0) {
            setCellValueEx(x, y, Color.WHITE, " ", Color.WHITE);
        }
    }

    public void updateView() {
        for (int i = 0; i < model.length; i++) {
            for (int j = 0; j < model[i].length; j++) {
                updateCellView(i, j, model[i][j]);
            }
        }
    }

    public void onMouseLeftClick(int x, int y) {
        if (isGameStopped) return;
        if (model[x][y] != 0) return;

        setSignAndCheck(x, y);

        if (!isGameStopped) {
            currentPlayer = 3 - currentPlayer;
            computerTurn();
            if (!isGameStopped) {
                currentPlayer = 3 - currentPlayer;
            }
        }
    }

    public void setSignAndCheck(int x, int y) {
        model[x][y] = currentPlayer;
        updateView();

        if (checkWin(x, y, currentPlayer)) {
            isGameStopped = true;
            if (currentPlayer == 1) {
                showMessageDialog(Color.NONE, "You Win!", Color.GREEN, 75);
            }
            if (currentPlayer == 2) {
                showMessageDialog(Color.NONE, "Game Over", Color.RED, 75);
            }
        }

        if (!hasEmptyCell()) {
            showMessageDialog(Color.NONE, " Draw!",  Color.BLUE, 75);
            isGameStopped = true;
        }
    }

    public boolean checkWin(int x, int y, int n) {
        if (model[x][0] == n && model[x][1] == n && model[x][2] == n)
            return true;
        if (model[0][y] == n && model[1][y] == n && model[2][y] == n)
            return true;
        if (model[0][0] == n && model[1][1] == n && model[2][2] == n)
            return true;
        if (model[0][2] == n && model[1][1] == n && model[2][0] == n)
            return true;
        return false;
    }

    public boolean hasEmptyCell() {
        for (int i = 0; i < model.length; i++) {
            for (int j = 0; j < model[i].length; j++) {
                if (model[i][j] == 0) return true;
            }
        }
        return false;
    }

    public void onKeyPress(Key key) {
        if ((key == Key.SPACE && isGameStopped) || key == Key.ESCAPE)  {
            model = new int[3][3];
            startGame();
            updateView();
        }
    }

    public void computerTurn() {
        if (model[1][1] == 0) {
            setSignAndCheck(1, 1);
            return;
        }

        for (int i = 0; i < model.length; i++) {
            for (int j = 0; j < model[i].length; j++) {
                if (checkFutureWin(i, j, currentPlayer)){
                    setSignAndCheck(i, j);
                    return;
                }
            }
        }

        for (int i = 0; i < model.length; i++) {
            for (int j = 0; j < model[i].length; j++) {
                if (checkFutureWin(i, j, 3 - currentPlayer)){
                    setSignAndCheck(i, j);
                    return;
                }
            }
        }

        for (int i = 0; i < model.length; i++) {
            for (int j = 0; j < model[i].length; j++) {
                if (model[i][j] == 0) {
                    setSignAndCheck(i, j);
                    return;
                }
            }
        }
    }

    public boolean checkFutureWin(int x, int y, int n) {
        if (model[x][y] != 0) return false;

        model[x][y] = n;
        boolean isWin = checkWin(x, y, n);
        model[x][y] = 0;

        return isWin;
    }

}
 */
