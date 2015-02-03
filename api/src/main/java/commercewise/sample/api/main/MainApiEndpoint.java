package commercewise.sample.api.main;

import org.broadleafcommerce.core.web.api.endpoint.catalog.CatalogEndpoint;
import org.broadleafcommerce.core.web.api.wrapper.CategoryWrapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by chanwook on 2015. 2. 2..
 */
@Controller
public class MainApiEndpoint extends CatalogEndpoint {
    // id에 해당하는 카테고리+서브카테고리+상품 조회 API
    @RequestMapping(value = "/api/category/{id}", method = RequestMethod.GET)
    public CategoryWrapper getCategory(@PathVariable("id") Long categoryId,
                                       @RequestParam(value = "productLimit", defaultValue = "20") int productLimit,
                                       @RequestParam(value = "productOffset", defaultValue = "0") int productOffset,
                                       @RequestParam(value = "subcategoryLimit", defaultValue = "20") int subcategoryLimit,
                                       @RequestParam(value = "subcategoryOffset", defaultValue = "0") int subcategoryOffset,
                                       HttpServletRequest request
    ) {
        CategoryWrapper category = super.findCategoryById(request, categoryId, productLimit, productOffset,
                subcategoryLimit, subcategoryOffset);
        return category;
    }
}
