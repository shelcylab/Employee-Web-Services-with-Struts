<%@page contentType="text/html"%>

<!--

    Licensed to the Apache Software Foundation (ASF) under one
    or more contributor license agreements.  See the NOTICE file
    distributed with this work for additional information
    regarding copyright ownership.  The ASF licenses this file
    to you under the Apache License, Version 2.0 (the
    "License"); you may not use this file except in compliance
    with the License.  You may obtain a copy of the License at

      http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing,
    software distributed under the License is distributed on an
    "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
    KIND, either express or implied.  See the License for the
    specific language governing permissions and limitations
    under the License.

-->

<%@page pageEncoding="UTF-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>

<html:html lang="true">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><bean:message key="empDetails.title"/></title>
        <html:base/>
    </head>
    <body style="background-color: white">

        <h3><bean:message key="empDetails.heading"/></h3>
        <table border = "1">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Email</th>
                <th>Salary</th>
            </tr>

            <logic:iterate id="employeeListing" name="EmpDetailsForm" property="employeeList">
                <tr>
                    <td>
                        <bean:write name="employeeListing" property="ID"/> 
                    </td>
                    <td>
                        <bean:write name="employeeListing" property="name"/>
                    </td>
                    <td>
                        <bean:write name="employeeListing" property="email"/> 
                    </td>
                    <td>
                        <bean:write name="employeeListing" property="salary"/> 
                    </td>
                </tr>

            </logic:iterate>
        </table>
    </body>
</html:html>