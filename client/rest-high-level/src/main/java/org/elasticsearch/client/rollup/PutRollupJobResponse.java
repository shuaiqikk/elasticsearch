/*
 * Licensed to Elasticsearch under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.elasticsearch.client.rollup;

import org.elasticsearch.common.xcontent.ConstructingObjectParser;
import org.elasticsearch.common.xcontent.XContentParser;

import java.io.IOException;

public class PutRollupJobResponse extends AcknowledgedResponse {

    public PutRollupJobResponse(boolean acknowledged) {
        super(acknowledged);
    }

    private static final ConstructingObjectParser<PutRollupJobResponse, Void> PARSER = AcknowledgedResponse
            .generateParser("delete_rollup_job_response", PutRollupJobResponse::new, AcknowledgedResponse.PARSE_FIELD_NAME);

    public static PutRollupJobResponse fromXContent(final XContentParser parser) throws IOException {
        return PARSER.parse(parser, null);
    }
}
