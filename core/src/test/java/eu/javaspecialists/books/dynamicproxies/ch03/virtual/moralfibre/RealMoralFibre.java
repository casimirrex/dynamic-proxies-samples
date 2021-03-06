/*
 * Copyright (C) 2020 Heinz Max Kabutz
 *
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.  Heinz Max Kabutz
 * licenses this file to you under the Apache License, Version
 * 2.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the
 * License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied.  See the License for the specific
 * language governing permissions and limitations under the
 * License.
 */

package eu.javaspecialists.books.dynamicproxies.ch03.virtual
            .moralfibre;

public class RealMoralFibre implements MoralFibre {
  // very expensive to make moral fibre!
  private byte[] costOfMoralFibre = new byte[900_000];

  { System.out.println("Moral Fibre Created!"); }

  public double actSociallyResponsibly() { // AIDS orphans
    return costOfMoralFibre.length / 3;
  }
  public double empowerEmployees() { // shares to employees
    return costOfMoralFibre.length / 3;
  }
  public double cleanupEnvironment() { // oiled sea birds
    return costOfMoralFibre.length / 3;
  }
}