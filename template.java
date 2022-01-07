
        import org.dreambot.api.methods.skills.Skill;
        import org.dreambot.api.script.AbstractScript;
        import org.dreambot.api.script.Category;
        import org.dreambot.api.script.ScriptManifest;



@ScriptManifest(name = "WC Bot", description = "Should progress thru willow", author = "Brotato",
        version = 2.0, category = Category.WOODCUTTING, image = "")
public class WoodChoppa extends AbstractScript {

    @Override // Infinite loop
    public int onLoop() {
        State state;
    }
        switch(getState()){




    }

    //State names
    private enum State{
        

    }
    //Checks if a certain condition is met and then returns that state
    //Define all states the bot should be in
    private State getState() {


     
        return state;
    }
    public void onStart() {
        log("Bot started");
    }
    public void onExit(){
        log("Bot ended!");
    }
    public int randomNum(int i, int k){
        int number = (int)(Math.random() * (k - i)) + i;
        return number;
    }

}
