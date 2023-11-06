package gameplay;

import gamemap_grammar.GameMapLexer;
import gamemap_grammar.GameMapParser;
import gameplay.World;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadWorldDataFile
{

/**
 * Static method to read a text file containing
 * a basic World to be played by the Game Engine
 *
 * */
    public static World basicWorld()
    {
        //read a basic map from a text file and
        //use antlr to parse and construct a World object.

        try {
            GameMapLexer lexer = new GameMapLexer(CharStreams.fromFileName("level.txt"));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            GameMapParser parser = new GameMapParser(tokens);
            ParseTree tree = parser.gamemap();
            WorldVisitor worldVisitor = new WorldVisitor();
            Entity entity = worldVisitor.visit(tree);
            return null;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
