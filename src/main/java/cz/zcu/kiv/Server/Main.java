package cz.zcu.kiv.Server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/***********************************************************************************************************************
 *
 * This file is part of the Spark_Back-end-cz.zcu.kiv.Server project

 * ==========================================
 *
 * Copyright (C) 2017 by University of West Bohemia (http://www.zcu.cz/en/)
 *
 ***********************************************************************************************************************
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 ***********************************************************************************************************************
 *
 * Main, 2017/07/12 15:11 Dorian Beganovic
 *
 **********************************************************************************************************************/
@EnableAsync
@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        Initialize.initFolder();
        SpringApplication.run(Main.class,args);
    }
}
