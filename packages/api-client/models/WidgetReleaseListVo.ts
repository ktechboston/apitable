/**
 * Api Document
 * Backend_Server Api Document
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { HttpFile } from '../http/http';

/**
* Widget Release Version History View
*/
export class WidgetReleaseListVo {
    /**
    * Publish this Sha value
    */
    'releaseSha'?: string;
    /**
    * EDITION
    */
    'version'?: string;
    /**
    * Status (0: to be approved, 1: approved, 2: rejected)
    */
    'status'?: number;
    /**
    * Code Address
    */
    'releaseCodeBundle'?: string;
    /**
    * Source code address
    */
    'sourceCodeBundle'?: string;
    /**
    * Current release version
    */
    'currentVersion'?: boolean;

    static readonly discriminator: string | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "releaseSha",
            "baseName": "releaseSha",
            "type": "string",
            "format": ""
        },
        {
            "name": "version",
            "baseName": "version",
            "type": "string",
            "format": ""
        },
        {
            "name": "status",
            "baseName": "status",
            "type": "number",
            "format": "int32"
        },
        {
            "name": "releaseCodeBundle",
            "baseName": "releaseCodeBundle",
            "type": "string",
            "format": ""
        },
        {
            "name": "sourceCodeBundle",
            "baseName": "sourceCodeBundle",
            "type": "string",
            "format": ""
        },
        {
            "name": "currentVersion",
            "baseName": "currentVersion",
            "type": "boolean",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return WidgetReleaseListVo.attributeTypeMap;
    }

    public constructor() {
    }
}

