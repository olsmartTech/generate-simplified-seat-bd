/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.generate.simplified.core.accounting.service;

import com.generate.simplified.core.model.ParamBean;
import com.generate.simplified.core.entity.AccountCategories;
import com.generate.simplified.core.entity.AccountCategoriesDet;
import java.util.List;

/**
 *
 * @author samsung
 */
public interface AccountingCategoriesService {

    String createAccountingCategories(AccountCategories a);

    List<AccountCategories> listViewAccounting(AccountCategories a);

    AccountCategories viewAccountingById(AccountCategories a);

    String createAccountingCategoriesDet(AccountCategoriesDet a);
    
    List<AccountCategoriesDet> listViewAccountingDet(ParamBean p);
    
}
