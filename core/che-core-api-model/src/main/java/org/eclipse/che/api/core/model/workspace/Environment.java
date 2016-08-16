/*******************************************************************************
 * Copyright (c) 2012-2016 Codenvy, S.A.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Codenvy, S.A. - initial API and implementation
 *******************************************************************************/
package org.eclipse.che.api.core.model.workspace;

import java.util.Map;

/**
 * Defines environment for machines network.
 *
 * @author gazarenkov
 * @author Alexander Garagatyi
 */
public interface Environment {

    /**
     * Returns environment display name. It is mandatory and unique per workspace
     */
    String getName();

    /**
     * Returns the recipe (the main script) to define this environment (compose, kubernetes pod).
     * Type of this recipe defines engine for composing machines network runtime
     */
    EnvironmentRecipe getRecipe();

    Map<String, ? extends ExtendedMachine> getMachines();

    // TODO external servers
}
