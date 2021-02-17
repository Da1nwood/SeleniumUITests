package app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public abstract class Page implements ICsvPath {

    protected String scvPath = this.getCsvPath();

    public Field field(String alias) {
        return new Field(getXpathNyAlias(alias));
    }

    private String getXpathNyAlias(String alias) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/test/resources/" + scvPath + ".csv"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] value = line.split(",");
                if (value[0].equals(alias)) {
                    return value[1].trim();
                }
            }
        } catch (IOException io) {
            Log.fatal(io.getMessage());
        }
        Log.fatal("Path not found");
        return "";
    }
}
