/*
 * Copyright 2010-2021 Alfresco Software, Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.activiti.test.matchers;

public class EndEventMatchers extends ActivityMatchers {

    private static final String END_EVENT = "endEvent";

    private EndEventMatchers(String definitionKey) {
        super(definitionKey);

    }

    @Override
    public String getActivityType() {
        return END_EVENT;
    }

    public static EndEventMatchers endEvent(String definitionKey) {
        return new EndEventMatchers(definitionKey);
    }

}
