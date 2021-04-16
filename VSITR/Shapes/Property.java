package VSITR.Shapes;

public interface Property {
    public void color();
    public void dimension();
}
/**
 * sample
 */
interface sample{
    
}

interface sample2 extends Property, sample{
    public void color2();    
}