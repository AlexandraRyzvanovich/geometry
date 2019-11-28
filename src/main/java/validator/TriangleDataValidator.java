package validator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TriangleDataValidator {
    private static final Logger logger = LogManager.getLogger();

    private final String REGEX_LINE = "([+-]?\\d+(\\.\\d+)?(d|D)?(\\s+|$))+$";

    public Boolean isValidLine(String line) {
        logger.info("Validating line");

        return line.matches(REGEX_LINE);
    }
}
