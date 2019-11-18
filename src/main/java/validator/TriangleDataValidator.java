package validator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TriangleDataValidator {
    Logger log = LogManager.getLogger(TriangleDataValidator.class.getName());

    private final String REGEX_LINE = "([+-]?\\d+(\\.\\d+)?(d|D)?(\\s+|$))+$";

    public Boolean isValidLine(String line) {
        log.info("Validating line");

        return line.matches(REGEX_LINE);
    }
}
