package pkgCore;

import java.util.LinkedList;

public class Round {

	private int ComeOutScore;
	private int ContinueRoll;
	private static eGameResult eGameResult;
	private LinkedList<Roll> rolls = new LinkedList<Roll>();

	public Round() {

		boolean roundOver = false;
		Roll ComeOutRoll = new Roll();
		rolls.add(ComeOutRoll);
		this.ComeOutScore = ComeOutRoll.getScore();
		
		switch (ComeOutScore) {
		
		case 7:
		case 11:
			roundOver = true;
			eGameResult = eGameResult.NATURAL;
			break;
		
		case 2:
		case 3:
		case 12:
			roundOver = true;
			eGameResult = eGameResult.CRAPS;
		}

		while (!roundOver) {

			Roll ContinueRoll = new Roll();
			this.ContinueRoll = ContinueRoll.getScore();
			rolls.add(ContinueRoll);

			if (ContinueRoll.getScore() == ComeOutRoll.getScore()) {
				roundOver = true;
				eGameResult = eGameResult.POINT;
			}

			else if (ContinueRoll.getScore() == 7) {
				roundOver = true;
				eGameResult = eGameResult.SEVEN_OUT;
			}
		}    
	}

	public int getComeoutScore() {
		return this.ComeOutScore;
		
	}
	
	public int getContinueRoll() {
		return this.ContinueRoll;
	}
	
		
	public int RollCount() {
		return rolls.size();
	}

	public LinkedList<Roll> getRolls() {
		return rolls;
	}

	public eGameResult getResult() {
		return eGameResult;
	}
}
