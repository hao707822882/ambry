/**
 * Copyright 2015 LinkedIn Corp. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 */
package com.github.ambry.admin;

import com.github.ambry.rest.RestServerMain;


/**
 * Used for starting/stopping an instance of {@link com.github.ambry.rest.RestServer} that acts as an Admin REST server.
 */
public class AdminRestServerMain {

  public static void main(String[] args) {
    RestServerMain.main(args);
  }
}