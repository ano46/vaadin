/*
 * Copyright 2000-2013 Vaadin Ltd.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.vaadin.sass.internal.parser.function;

import com.vaadin.sass.internal.parser.LexicalUnitImpl;
import com.vaadin.sass.internal.tree.Node.BuildStringStrategy;
import com.vaadin.sass.internal.util.ColorUtil;

/**
 * 
 * @since 7.2
 * @author Vaadin Ltd
 */
public class LightenFunctionGenerator implements SCSSFunctionGenerator {

    @Override
    public String getFunctionName() {
        return "lighten";
    }

    @Override
    public String printState(LexicalUnitImpl function,
            BuildStringStrategy strategy) {
        return strategy.build(ColorUtil.lighten(function));
    }

}
