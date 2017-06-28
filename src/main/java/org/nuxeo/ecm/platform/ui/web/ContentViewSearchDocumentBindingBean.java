package org.nuxeo.ecm.platform.ui.web;

import java.io.Serializable;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.jboss.seam.ScopeType;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.annotations.Scope;
import org.nuxeo.ecm.core.api.DocumentModel;
import org.nuxeo.ecm.core.api.DocumentModelFactory;
import org.nuxeo.ecm.core.api.PropertyException;

/**
 * Seam component to initialize default values of a widget used in a search content view.
 * Studio content view name: SUPNXP-20470_searchContentViewDefaultValuesListProperty
 * schema and name of property associated to widget: supnxp-20470_defaultvalues:prop1
 *
 * @see https://jira.nuxeo.com/browse/SUPNXP-20470
 */
@Name("contentviewsearchdocumentbindingbean")
@Scope(ScopeType.CONVERSATION)
public class ContentViewSearchDocumentBindingBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private static final Log log = LogFactory.getLog(ContentViewSearchDocumentBindingBean.class);

    public DocumentModel getCvDocumentModel() throws PropertyException {
        log.debug("<getCvDocumentModel> ");
        DocumentModel bareDoc = DocumentModelFactory.createDocumentModel("SUPNXP-20470_searchContentViewDefaultValuesListProperty_cv");

        bareDoc.setPropertyValue("SUPNXP-20470_searchContentViewDefaultValuesListProperty_cv:supnxp-20470_defaultvalues_prop1", new String[] {"val1", "val3"});
        return bareDoc;
    }
}
