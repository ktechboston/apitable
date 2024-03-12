/*
 * APITable <https://github.com/apitable/apitable>
 * Copyright (C) 2022 APITable Ltd. <https://apitable.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.apitable.shared.cache.bean;

import java.io.Serializable;
import lombok.Data;

/**
 * <p>
 * resource in user space.
 * </p>
 *
 * @author Shawn Deng
 */
@Data
public class SpaceResourceDto implements Serializable {

    private static final long serialVersionUID = 3010701075278742759L;

    private String resourceCode;

    private String resourceName;

    private String resourceDesc;

    private Boolean assignable;

    private String groupCode;

    private String groupName;

    private String groupDesc;

    private String menuCode;

    private String menuName;
}
