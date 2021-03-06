/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.lexmodelbuilding.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lex-models-2017-04-19/GetBotVersions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetBotVersionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the bot for which versions should be returned.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A pagination token for fetching the next page of bot versions. If the response to this call is truncated, Amazon
     * Lex returns a pagination token in the response. To fetch the next page of versions, specify the pagination token
     * in the next request.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of bot versions to return in the response. The default is 10.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The name of the bot for which versions should be returned.
     * </p>
     * 
     * @param name
     *        The name of the bot for which versions should be returned.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the bot for which versions should be returned.
     * </p>
     * 
     * @return The name of the bot for which versions should be returned.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the bot for which versions should be returned.
     * </p>
     * 
     * @param name
     *        The name of the bot for which versions should be returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBotVersionsRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A pagination token for fetching the next page of bot versions. If the response to this call is truncated, Amazon
     * Lex returns a pagination token in the response. To fetch the next page of versions, specify the pagination token
     * in the next request.
     * </p>
     * 
     * @param nextToken
     *        A pagination token for fetching the next page of bot versions. If the response to this call is truncated,
     *        Amazon Lex returns a pagination token in the response. To fetch the next page of versions, specify the
     *        pagination token in the next request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A pagination token for fetching the next page of bot versions. If the response to this call is truncated, Amazon
     * Lex returns a pagination token in the response. To fetch the next page of versions, specify the pagination token
     * in the next request.
     * </p>
     * 
     * @return A pagination token for fetching the next page of bot versions. If the response to this call is truncated,
     *         Amazon Lex returns a pagination token in the response. To fetch the next page of versions, specify the
     *         pagination token in the next request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A pagination token for fetching the next page of bot versions. If the response to this call is truncated, Amazon
     * Lex returns a pagination token in the response. To fetch the next page of versions, specify the pagination token
     * in the next request.
     * </p>
     * 
     * @param nextToken
     *        A pagination token for fetching the next page of bot versions. If the response to this call is truncated,
     *        Amazon Lex returns a pagination token in the response. To fetch the next page of versions, specify the
     *        pagination token in the next request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBotVersionsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of bot versions to return in the response. The default is 10.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of bot versions to return in the response. The default is 10.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of bot versions to return in the response. The default is 10.
     * </p>
     * 
     * @return The maximum number of bot versions to return in the response. The default is 10.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of bot versions to return in the response. The default is 10.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of bot versions to return in the response. The default is 10.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBotVersionsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetBotVersionsRequest == false)
            return false;
        GetBotVersionsRequest other = (GetBotVersionsRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public GetBotVersionsRequest clone() {
        return (GetBotVersionsRequest) super.clone();
    }

}
