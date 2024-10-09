/*
 * Sample API
 * Optional multiline or single-line description in [CommonMark](http://commonmark.org/help/) or HTML.
 *
 * OpenAPI spec version: 0.1.9
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://github.com/OpenAPITools/openapi-generator
 *
 * Generator version: 7.10.0-SNAPSHOT
 */


import http from "k6/http";
import { group, check, sleep } from "k6";

const BASE_URL = "http://api.example.com/v1";
const TOKEN = "TOKEN_VALUE_HERE";
// Sleep duration between successive requests.
// You might want to edit the value of this variable or remove calls to the sleep function on the script.
const SLEEP_DURATION = 0.1;
// Global variables should be initialized.

export default function() {
    group("/users", () => {

        // Request No. 1: 
        {
            let url = BASE_URL + `/users`;
            let params = {
                headers: {
                    "Authorization": `Basic ${TOKEN}`, "Accept": "application/json"
                }
            };
            let request = http.get(url, params);

            check(request, {
                "A JSON array of user names": (r) => r.status === 200
            });
        }
    });

    group("/public", () => {

        // Request No. 1: 
        {
            let url = BASE_URL + `/public`;
            let request = http.get(url);

            check(request, {
                "A JSON object with public information": (r) => r.status === 200
            });
        }
    });

    group("/private", () => {

        // Request No. 1: 
        {
            let url = BASE_URL + `/private`;
            let params = {
                headers: {
                    "Authorization": `Basic ${TOKEN}`, "Accept": "application/json"
                }
            };
            let request = http.get(url, params);

            check(request, {
                "A JSON object with private information": (r) => r.status === 200
            });
        }
    });

}
