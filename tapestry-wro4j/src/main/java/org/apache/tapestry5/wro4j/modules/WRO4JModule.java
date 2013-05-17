// Copyright 2013 The Apache Software Foundation
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package org.apache.tapestry5.wro4j.modules;

import org.apache.tapestry5.internal.wro4j.CoffeeScriptResourceCompiler;
import org.apache.tapestry5.ioc.MappedConfiguration;
import org.apache.tapestry5.ioc.annotations.Contribute;
import org.apache.tapestry5.services.assets.ResourceTransformer;
import org.apache.tapestry5.services.assets.StreamableResourceSource;

/**
 * Configures CoffeeScript-to-JavaScript compilation.
 *
 * @since 5.4
 */
public class WRO4JModule
{
    @Contribute(StreamableResourceSource.class)
    public static void provideCoffeeScriptCompilation(MappedConfiguration<String, ResourceTransformer> configuration)
    {
        configuration.addInstance("coffee", CoffeeScriptResourceCompiler.class);
    }
}
