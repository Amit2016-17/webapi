/*
 	Copyright (c) 2019 TOSHIBA Digital Solutions Corporation.

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
*/

package com.toshiba.mwcloud.gs.tools.webapi.dto;

public class GWPutRowOutput {

	/**
	 * Number of successfully input rows
	 */
	private int count;

	/**
	 *  Get the number of successfully input rows
	 *  
	 * @return Number of successfully input rows 
	 */
	public int getCount() {
		return count;
	}

	/**
	 * Set the number of successfully input rows
	 * 
	 * @param count Number of successfully input rows
	 */
	public void setCount(int count) {
		this.count = count;
	}
	
	
}
