/*
 * Copyright (C) 2018  niaoge<78493244@qq.com>
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
package org.stategen.framework.lite;

import org.stategen.framework.lite.enums.VisitCheckType;
import org.stategen.framework.lite.enums.VisitType;

/**
 * IMenu
 * <pre>
 * database table: visit
 * database table comments: IMenu
 * This file is generated by <tt>dalgen</tt>, a DAL (Data Access Layer)
 * 
 * 该类仅不可以修改dalgen生成的属生(field)类型 ,方法(Method)返回值类型和参数类型
 * </pre>.
 *
 * @param <M> the generic type
 */
public interface IMenu<M> {

    public void setProjectName(String projectName);

    public void setControllerName(String controllerName);

    public void setMethodName(String methodName);

    public void setUrl(String url);

    public void setName(String name);

    public void setRoute(String route);

    public void setVisitType(VisitType visitType);

    public void setCheckType(VisitCheckType visitCheckType);

    public void setMenuParent(M menuParent);
    
    public void setBreadParent(M BreadParent);
    
    public String getControllerName();

    public static <M extends IMenu<M>> M createMenu(Class<M> menuClz, String controllerName, String methodName, String url, String name,
                                                      String route, VisitType visitType,
                                                      VisitCheckType visitCheckType) throws IllegalArgumentException, IllegalAccessException  {
        M result;
        try {
            result = menuClz.newInstance();
        } catch (InstantiationException e) {
            throw new IllegalArgumentException(e);
        }
        result.setControllerName(controllerName);
        result.setMethodName(methodName);
        result.setUrl(url);
        result.setName(name);
        result.setRoute(route);
        result.setVisitType(visitType);
        result.setCheckType(visitCheckType);
        return result;
    }

}