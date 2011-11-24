package scrumboard

class Board {

    static constraints = {
    }
	
	static hasMany = [stories:Story]
	String name
	
	void addStory(Story aStory){
		stories += aStory
		
	}
}
