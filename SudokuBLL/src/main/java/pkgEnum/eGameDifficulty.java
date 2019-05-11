package pkgEnum;

import java.util.HashMap;
import java.util.Map;

public enum eGameDifficulty {
	EASY(100),MEDIUM(500),HARD(1000);
	 private int iDifficultyValue;  
	 private static final Map<Integer, eGameDifficulty> lookup = new HashMap<Integer, eGameDifficulty>();

	    static {
	        for (eGameDifficulty e : eGameDifficulty.values()) {
	            lookup.put(e.getiDifficulty(), e);
	        }
	    }

	    private eGameDifficulty(int iDifficultyValue) {
	        this.iDifficultyValue = iDifficultyValue;
	    }

	    public int getiDifficulty() {
	        return iDifficultyValue;
	    }
	    public static eGameDifficulty get(int iDifficultyValue) {
	    	if(iDifficultyValue<100) {
	    		return null;
	    	}
	    	else if(iDifficultyValue<500) {
	    		return eGameDifficulty.EASY;
	    	}
	    	else if(iDifficultyValue<1000) {
	    		return eGameDifficulty.MEDIUM;
	    	}
	    	else {
	    		return eGameDifficulty.HARD;
	    	}
	    }
}

