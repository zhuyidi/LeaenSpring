package Concert;

/**
 * Created by dela on 10/23/17.
 */
public class CriticismEngineImpl implements CriticismEngine {
    public CriticismEngineImpl(){ }

    public String getCriticism() {
        int i = (int) (Math.random() * criticismPool.length);
        return criticismPool[i];
    }

    private String[] criticismPool;
    public void setCriticismPool(String[] criticismPool){
        this.criticismPool =criticismPool;
    }
}
