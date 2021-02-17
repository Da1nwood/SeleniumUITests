package app;
public interface ICsvPath {
    default String getCsvPath(){
        return this.getClass().getSimpleName();
    }
}
