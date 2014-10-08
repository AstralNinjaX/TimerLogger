package devinfalgoust.util.timerlogger;

import java.io.PrintStream;

/**
 * The TimerLoggable abstract class houses a TimerLogger. It is designed to be extended,
 * giving the child class the ability to use the TimerLogger without having to create on.
 * It is created with a default TimerLogger.
 * 
 * @author Devin Falgoust
 * 
 * Copyright 2013 Devin Falgoust
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
public abstract class TimerLoggable {

	protected TimerLogger logger = new TimerLogger();

	/******************************
	 * Logging Functions
	 ******************************/

	/**
	 * Calls the logger's log function
	 * 
	 * @param message
	 */
	protected void log(String message) {
		logger.log(message);
	}

	/**
	 * Calls the logger's logError function
	 * 
	 * @param message
	 */
	protected void logError(String message) {
		logger.logError(message);
	}

	/**
	 * Calls the logger's start function
	 * 
	 * @param timerName
	 */
	protected void logTimerStart(String timerName) {
		logger.start(timerName);
	}

	/**
	 * Calls the logger's end function
	 * 
	 * @param timerName
	 */
	protected void logTimerEnd(String timerName) {
		logger.end(timerName);
	}

	/******************************
	 * Logger Variable Functions
	 ******************************/

	/**
	 * Calls the logger's setTabifyFlag function
	 * 
	 * @param isTabify
	 */
	protected void setTabifyFlag(Boolean isTabify) {
		logger.setTabifyFlag(isTabify);
	}

	/**
	 * Calls the logger's setOutPrintStream function
	 * 
	 * @param out
	 */
	protected void setOutPrintStream(PrintStream out) {
		logger.setOutPrintStream(out);
	}

	/**
	 * Calls the logger's setErrPrintStream function
	 * 
	 * @param err
	 */
	protected void setErrPrintStream(PrintStream err) {
		logger.setErrPrintStream(err);
	}

	/**
	 * Calls the logger's setOutAndErrPrintStreams function
	 * 
	 * @param stream
	 */
	protected void setOutAndErrPrintStreams(PrintStream stream) {
		logger.setOutAndErrPrintStreams(stream);
	}

}
